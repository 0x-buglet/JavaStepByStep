@echo off
echo [ STEP 1 ] Cleaning old files...
if exist bin (rd /s /q bin)
mkdir bin

echo [ STEP 2 ] Compiling src files...
javac -d bin -encoding UTF-8 src/*.java

echo [ STEP 3 ] Running CalculatorTest...
java -cp bin CalculatorTest

pause