program Project3;

var x, y: real;

BEGIN
  write('x = '); readln(x);
  
  if x < 0 then 
  y := abs(x)
  else 
  begin 
   if x = 0 then
   y := 5
   else
   y := sin(5 * x)
  end;
  
  writeln('y = ', y:5:2);
  
END.
