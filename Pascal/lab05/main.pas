program Project5;

var
  min, max, i: integer;
  y: real;

BEGIN
  min := -4;
  max := 6;

  for i := min to max do
  begin
    if (i > 0) then
    begin
      y := (sin(sqr(2 * i)) / cos(sqr(2 * i))) + (sin(3 * exp(3 * ln(i))) / cos(3 * exp(3 * ln(i))));
      writeln('y = ', y:5:2);
    end
    else
    writeln('Number is less than 0')
  end;
END.