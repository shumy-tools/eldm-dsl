package net.eldm.gen;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class CleanGen extends AbstractWorkflowComponent2 {
    Boolean all = false;
    
    public Boolean getAll() { return all; }
    public void setAll(Boolean all) { this.all = all; }
    
    @Override
    protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
        try {
            final Path src = Paths.get("./src/net/eldm/");
                deleteFile(src, "EldmDslStandaloneSetup.xtend");
                deleteFile(src, "EldmDslRuntimeModule.xtend");
                deleteFile(src, "SchDslStandaloneSetup.xtend");
                deleteFile(src, "SchDslRuntimeModule.xtend");
                
                deleteDir(src, "./generator");
                deleteDir(src, "./scoping");
                deleteDir(src, "./validation");
                deleteDir(src, "./parser");
                
            final Path xtendgen = Paths.get("./xtend-gen/net/eldm/");
                deleteDir(xtendgen, "./generator");
                deleteDir(xtendgen, "./scoping");
                deleteDir(xtendgen, "./validation");
                
            final Path srcgen = Paths.get("./src-gen/net/eldm/");
                deleteFile(srcgen, "AbstractEldmDslRuntimeModule.java");
                deleteFile(srcgen, "EldmDslStandaloneSetupGenerated.java");
                deleteFile(srcgen, "AbstractSchDslRuntimeModule.java");
                deleteFile(srcgen, "SchDslStandaloneSetupGenerated.java");
                
                deleteDir(srcgen, "./parser");
                deleteDir(srcgen, "./scoping");
                deleteDir(srcgen, "./serializer");
                deleteDir(srcgen, "./services");
                deleteDir(srcgen, "./validation");
                
                if (all) {
                    deleteFile(srcgen, "SchDsl.xtextbin");
                    deleteFile(srcgen, "EldmDsl.xtextbin");
                    
                    deleteDir(srcgen, "./eldmDsl");
                    deleteDir(srcgen, "./schDsl");
                }
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
    }
    
    protected void deleteFile(Path path, String file) {
        try {
            final Path src = path.resolve(file);
            Files.delete(src);
        } catch (Exception e) {
            return;
        }
    }
    
    protected void deleteDir(Path path, String dir) {
        try {
            final Path src = path.resolve(dir);
            Files.walk(src)
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
        } catch (Exception e) {
            return;
        }
    }
}
