program Project7;

const
SIZE = 5;

var
    A: array [1..SIZE] of real = (0, 1, 2, 3, 4);
    GroupGrowth: array [1..8] of real = (1.63, 1.78, 1.95, 1.98, 1.94, 1.75, 1.61, 2.04);
    i: integer;
    maxValue: real;

BEGIN

// Array value output 
for i := 1 to SIZE do
write('A[', i, ']=', A[i]:5:2, ' ');

writeln();

for i := 1 to SIZE do
writeln('A[', i, ']=', A[i]:5:2);

writeln();

// Array elemental value output
A[1] := 2.5;
A[2] := -3.56;
A[3] := 0.94;
A[4] := 5.74;
A[5] := 2.3;

for i := 1 to SIZE do 
write('A[', i, ']=', A[i]:5:2, ' ');

writeln();

for i := 1 to SIZE do
writeln('A[', i, ']=', A[i]:5:2);

writeln();

// Array value output with keyboard
for i := 1 to SIZE do
begin
write('A[', i, ']=');
readln(A[i]);
end;

writeln();

for i := 1 to SIZE do 
write('A[', i, ']=', A[i]:5:2, ' ');

writeln();

for i := 1 to SIZE do
writeln('A[', i, ']=', A[i]:5:2);

writeln();

// Array value output with randomizer
RANDOMIZE;

for i := 1 to size do 
A[i] := RANDOM(35);

writeln();

for i := 1 to SIZE do 
write('A[', i, ']=', A[i]:5:2, ' ');

writeln();

for i := 1 to SIZE do
writeln('A[', i, ']=', A[i]:5:2);

writeln();

// Task 5 
maxValue := GroupGrowth[1]; 

  for i := 2 to 8 do
  begin
    if GroupGrowth[i] > maxValue then
      maxValue := GroupGrowth[i];
  end;

  writeln('Biggest growth in the group is: ', maxValue:5:2);
END.