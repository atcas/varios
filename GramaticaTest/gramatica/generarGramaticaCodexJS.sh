export CLASSPATH=".:/home/x4/library/antlr4/antlr-4.5.3-complete.jar:$CLASSPATH"
java -Xmx500M -cp "/home/x4/library/antlr4/antlr-4.5.3-complete.jar:$CLASSPATH" org.antlr.v4.Tool Codex.g4 -Dlanguage=JavaScript  -o /home/x4/workspace/java/antlr4/examples/GramaticaTest/js/codexPax
