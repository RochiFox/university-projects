program Project12;

var
V, S, a: real;

Procedure FindRadius1 (S, a: Real; var V: Real);
begin
    if (S > 0) and (a > 0) then
        V := S * a
        else 
        writeln('Area of perpendicular section and side edge less than 0')
end;

Function FindRadius2 (S, a: Real):Real;
begin
if (S > 0) and (a > 0) then
        FindRadius2 := S * a
        else 
        writeln('Area of perpendicular section and side edge less than 0')
end;

BEGIN
write('Enter the area of perpendicular section: '); readln(S);
write('Enter the side edge: '); readln(a);

FindRadius1(S, a, V);
writeln('Procedure: ', V:5:2);

V := FindRadius2(S, a);
writeln('Function: ', V:5:2);
END.