program Project6;

const
  deltaX = 0.5;
  x = 2.5;

var
  min, max: real;
  y: real;

BEGIN
  min := -4;
  max := 6;

  while min <= max do
  begin
    if min <= 0 then
      writeln('Num is less than 0')
    else if min = x then
      break
    else
    begin
      y := (sin(sqr(2 * min)) / cos(sqr(2 * min))) + (sin(3 * exp(3 * ln(min))) / cos(3 * exp(3 * ln(min))));
      writeln('y = ', y:5:2);
    end;
    min := min + deltaX;
  end;
END.