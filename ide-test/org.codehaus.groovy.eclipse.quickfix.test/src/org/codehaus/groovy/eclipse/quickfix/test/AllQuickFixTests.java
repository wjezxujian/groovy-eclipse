/*
 * Copyright 2009-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.eclipse.quickfix.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.codehaus.groovy.eclipse.quickfix.test.resolvers.*;
import org.codehaus.groovy.eclipse.quickfix.test.templates.*;

public class AllQuickFixTests {
    public static Test suite() throws Exception {
        final TestSuite suite = new TestSuite(AllQuickFixTests.class.getName());
        suite.addTestSuite(QuickAssistTests.class);

        // resolvers
        suite.addTestSuite(GroovyProjectGroovyQuickFixTest.class);
        suite.addTestSuite(GroovyProjectJavaQuickFixTest.class);
        suite.addTestSuite(NonGroovyProjectQuickFixTest.class);

        // templates
        suite.addTest(GroovyTemplatesCompletionTests.suite());

        return suite;
    }
}
