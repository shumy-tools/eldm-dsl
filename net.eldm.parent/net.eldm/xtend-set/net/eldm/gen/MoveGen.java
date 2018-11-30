package net.eldm.gen;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class MoveGen extends AbstractWorkflowComponent2 {
    
    @Override
    protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
        try {
            final Path src = Paths.get("./src-gen/net/eldm/");
            final Path trg = Paths.get("../net.eldm.parser/src-set/net/eldm");
                moveFile(src, trg, "EldmDsl.xtextbin");
                moveFile(src, trg, "SchDsl.xtextbin");
                
                moveDir(src, trg, "./parser");
                moveDir(src, trg, "./scoping");
                moveDir(src, trg, "./serializer");
                moveDir(src, trg, "./services");
                moveDir(src, trg, "./validation");
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
    }
    
    protected void moveFile(Path from, Path to, String file) throws Exception {
        final Path src = from.resolve(file);
        final Path trg = to.resolve(file);
        Files.move(src, trg, StandardCopyOption.REPLACE_EXISTING);
    }
    
    protected void moveDir(Path from, Path to, String dir) throws Exception  {
        final Path src = from.resolve(dir);
        final Path trg = to.resolve(dir);
        
        Files.walk(src)
            .sorted(Comparator.reverseOrder())
            .forEach(srcFile -> {
                try {
                    if (srcFile.toFile().isFile()) {
                        final String relative = srcFile.toAbsolutePath().toString().replace(src.toAbsolutePath().toString(), "");
                        Path trgFile = trg.resolve("." + relative);
                        
                        //System.out.println("Moving: " + relative);
                        Files.createDirectories(trgFile.getParent());
                        Files.move(srcFile, trgFile, StandardCopyOption.REPLACE_EXISTING);
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }
}
