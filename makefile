JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = \
	StrAndIntCat.java\
	ContainsString.java\
	PrintString.java\
	Main.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

