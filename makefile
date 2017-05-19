JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = \
	Fact.java\
	Main.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

