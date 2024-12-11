# Define the Java compiler
JAVAC = javac

# Define the source files
SOURCES = $(wildcard *.java)

# Define the class files
CLASSES = $(SOURCES:.java=.class)

# Default target
all: $(CLASSES)

# Rule to compile .java files to .class files
%.class: %.java
    $(JAVAC) $<

# Clean target to remove .class files
clean:
    rm -f *.class

# Phony targets
.PHONY: all clean