program Project9;

var
  A: array [1..10, 1..5] of integer;
  m, n, i, j: integer;
  maxSumRow, currentSum: integer;
  maxSumRowNumber: integer;

BEGIN
m := 10;
n := 5;

// Filling an array with numbers
for i := 1 to m do
    for j := 1 to n do
      A[i, j] := random(9) + 1;

writeln('Array data output:');

// Array output
for i := 1 to m do
  begin
    for j := 1 to n do
      write(A[i, j], ' ');
    writeln();
  end;

  maxSumRow := 0;
  maxSumRowNumber := 0;

// Find the largest sum of elements
for i := 1 to m do
  begin
    currentSum := 0;

    for j := 1 to n do
      currentSum := currentSum + A[i, j];

    if currentSum > maxSumRow then
    begin
      maxSumRow := currentSum;
      maxSumRowNumber := i;
    end;
  end;

writeln();
writeln('Row Number: ', maxSumRowNumber);
writeln('Sum: ', maxSumRow);

END.