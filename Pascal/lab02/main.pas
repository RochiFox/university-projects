program Project2;

const 
    a = 2.55;
    b = -12.75;
    c = 4;

var E, D, unitA, upperNum, lowerNum, tg: real;

BEGIN 
writeln('Task 1');

unitA := abs(exp(a*b*ln(2))); { Unit of 2ab }

writeln('The unit is: ', unitA:5:2);

upperNum := (2 * b) - 4; { Upper formula }

writeln('The upper number is: ', upperNum:5:2);

tg := sin(c) / cos(c); { Find a tangens }

lowerNum := cos(b - 5) * tg; { Lower formula }

writeln('The lower number is: ', lowerNum:5:2);

E := unitA + (upperNum / lowerNum); { Formula }

writeln('The result is: ', E:5:2);

writeln('Task 2');

if (a > 0) and (b > 0) then
begin
  D := exp(3 * ln(a)) + exp((1/5) * ln(b));
  writeln(D:5:2);
end
else
begin
  writeln('a or b < 0');
end;

END.