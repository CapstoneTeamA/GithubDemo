JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = \
	PrintString.java\
	Main.java\
	Math.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

