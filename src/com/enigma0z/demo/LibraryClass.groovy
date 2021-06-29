package com.enigma0z.demo

class LibraryClass extends AbstractBaseClass {
    Object pipeline

    LibraryClass(Object pipeline, String value) {
        this.pipeline = pipeline
        
        // Stacktrace on the next line:
        // org.codehaus.groovy.runtime.typehandling.GroovyCastException: Cannot cast object 'com.enigma0z.demo.OtherLibraryClass@34841a9f' with class 'com.enigma0z.demo.OtherLibraryClass' to class 'com.enigma0z.demo.OtherLibraryClass'
        this.otherLibraryClass = new OtherLibraryClass(pipeline, value)
    }

    void doSomething() {
        pipeline.echo('LibraryClass.groovy')
        pipeline.echo(otherLibraryClass.value)
    }
}
