@Library('my-library') _

import com.enigma0z.demo.LibraryClass

LibraryClass libraryClass = new LibraryClass(this, 'value')

echo('TestPipeline.groovy')
libraryClass.doSomething()
