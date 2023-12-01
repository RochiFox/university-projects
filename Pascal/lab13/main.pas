program Project13;

var 
inputString, reversedString: string;
i, j: integer;

BEGIN
// Task 1
writeln('Task 1');
for i := 0 to 255 do 
writeln('chr(', i, '): ', chr(i));

// Task 2
writeln('Task 2');
write('Enter a string: ');
readln(inputString);

reversedString := '';

for j := length(inputString) downto 1 do 
    reversedString := reversedString + inputString[j];
    
writeln(reversedString);

END.