package com.enigma0z.demo

class OtherLibraryClass {
    Object pipeline
    String value

    OtherLibraryClass(Object pipeline, String value) {
        this.pipeline = pipeline
        this.value = value
    }

    void doSomething() {
        pipeline.echo('OtherLibraryClass.groovy')
        pipeline.echo(this.value)
    }
}
