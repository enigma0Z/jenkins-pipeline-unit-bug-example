package com.enigma0z.demo

import com.lesfurets.jenkins.unit.BasePipelineTest
import com.lesfurets.jenkins.unit.global.lib.LibraryConfiguration
import org.junit.Before
import org.junit.Test

import static com.lesfurets.jenkins.unit.global.lib.ProjectSource.projectSource

class LibraryScriptClassTest extends BasePipelineTest {
    @Before
    @Override
    void setUp() {
        super.setUp()

        LibraryConfiguration library = new LibraryConfiguration.LibraryBuilder()
                .name('my-library')
                .retriever(projectSource())
                .defaultVersion('<notNeeded>')
                .targetPath('<notNeeded>')
                .allowOverride(true)
                .implicit(true)
                .build()

        helper.registerSharedLibrary(library)
    }

    @Test
    void runTest() {
        runScript('TestPipeline.groovy')
    }
}
