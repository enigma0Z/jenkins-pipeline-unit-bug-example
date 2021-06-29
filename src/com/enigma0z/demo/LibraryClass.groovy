package com.enigma0z.demo

class LibraryClass extends AbstractBaseClass {
    Object pipeline

    LibraryClass(Object pipeline, String value) {
        this.pipeline = pipeline
        this.otherLibraryClass = new OtherLibraryClass(pipeline, value)
    }

    void doSomething() {
        pipeline.echo('LibraryClass.groovy')
        pipeline.echo(otherLibraryClass.value)
    }
}
