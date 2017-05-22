JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = \
	PrintString.java\
        StrCompare.java\
	Main.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

