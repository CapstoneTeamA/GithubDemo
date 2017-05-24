JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = \
	Stats.java\
	StrAndIntCat.java\
	ContainsString.java\
	PrintString.java\
	Main.java\
	Math.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

