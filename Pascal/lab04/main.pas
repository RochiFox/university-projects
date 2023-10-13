program Project4;

var 
x, y: integer;

BEGIN
  x := 5 * 3;
  y := x + 20;
  
  while x <= y do
  begin 
    writeln(x, ' ', sqr(x), ' ', exp(3 * ln(x)):3:2, ' ');
    x := x + 1;
  end;
END.
