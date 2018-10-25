Just command runner support for IntelliJ-based IDEs
===================================================
Plugin to edit Justfile(https://github.com/casey/just) and run recipes in IntelliJ-based IDEs.

Features:
 * syntax highlighting
 * run configurations
 * gutter marks & context actions to run recipe
 * language injection for code block

Example justfile: https://github.com/casey/just/blob/master/justfile

### Development
 
Please install just by 'brew install just'. 

* build a plugin

```
$  just build
```

* test plugin in IDE run
```
$ just run
```

### Thanks
:two_hearts: intellij-justfile refers idea & code from https://github.com/kropp/intellij-makefile

### References

* gradle-intellij-plugin: https://github.com/JetBrains/gradle-intellij-plugin
* Grammar-Kit: https://github.com/JetBrains/Grammar-Kit
