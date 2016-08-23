export CLASSPATH=".:/home/x4/library/antlr4/antlr-4.5.3-complete.jar:$CLASSPATH"
java -Xmx500M -cp "/home/x4/library/antlr4/antlr-4.5.3-complete.jar:$CLASSPATH" org.antlr.v4.Tool Cymbol.g4 -package com.djaramillo.Cymbol  -o ../src/com/djaramillo/Cymbol
