export CLASSPATH=".:/home/x4/library/antlr4/antlr-4.5.3-complete.jar:$CLASSPATH"
java -Xmx500M -cp "/home/x4/library/antlr4/antlr-4.5.3-complete.jar:$CLASSPATH" org.antlr.v4.Tool Solidity.g4 -package com.djaramillo.Solidity  -o ../src/com/djaramillo/Solidity
