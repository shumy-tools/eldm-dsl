/*
 * generated by Xtext 2.15.0
 */
package net.eldm.tests

import com.google.inject.Inject
import net.eldm.eldmDsl.Domainmodel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(EldmDslInjectorProvider)
class EldmDslParsingTest {
	@Inject
	ParseHelper<Domainmodel> parseHelper
}
