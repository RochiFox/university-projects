program Project10;

const 
x = 0.2;
b = 2;

var 
y: real;
min, max: real;
Q: real;
number: real;

BEGIN
// First task
min := 0;
max := 2;

while min <= max do
    begin 
    y := 2 * cos(min) * exp(-min);
    min := min + x;
    writeln(y:5:2);
    end;

// Second task
write ('number is = '); readln(number);

if number < 0.5 then
    Q := 1
    else
    Q := b * number - (ln(b * number) / ln(10));

writeln(Q:5:2);
END. 