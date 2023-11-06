program Project8;

var
S: array [1..4, 1..3] of integer;
i, j: integer;
sum: integer;
mult: word;
minValue, maxValue: integer;

BEGIN
RANDOMIZE;

// Filling the array
for i := 1 to 4 do
    for j := 1 to 3 do
        S[i, j] := random(9) + 1;

writeln('Array data output:');

for i := 1 to 4 do
    for j := 1 to 3 do
    write(S[i, j], ' ');
    
// Calculation of sums and multipliers
sum := 0;
mult := 1;

for i := 1 to 4 do
    for j := 1 to 3 do
        sum := S[i, j] + sum;
        
for i := 1 to 4 do 
    for j := 1 to 3 do
        mult := S[i, j] * mult;
        
// Print the sum and mult of array
writeln();
writeln('The sum of array is: ', sum);
writeln('The mult of array is: ', mult);

// Find the min and max value of array
minValue := S[1, 1];
maxValue := S[1, 1];

for i := 1 to 4 do
    for j := 1 to 3 do
    begin 
        if S[i, j] < minValue then 
        minValue := S[i, j];
        if S[i, j] > maxValue then 
        maxValue := S[i, j];
    end;

writeln('The min value of array is: ', minValue);
writeln('The max value of array is: ', maxValue);
END.