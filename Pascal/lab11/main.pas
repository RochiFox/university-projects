program Project11;

var 
x, y, z: real;

Procedure Power1 (a, b: Real; var c: Real);
begin 
   if a>0 then
      c:=exp(b*ln(a))
   else if a<0 then
      c:=exp(b*ln(abs(a)))
     else if b=0 then
       c:=1
     else
       c:=0
end; 

Function Power2 (a, b: Real):Real;
begin 
if a>0 then
   Power2:=exp(b*ln(a))
else if a<0 then
   Power2:=exp(b*ln(abs(a)))
else if b=0 then
       Power2:=1
     else
       Power2:=0
end;

BEGIN
write('Enter x: '); readln(x);
write('Enter y: '); readln(y);

Power1(x, y, z);

writeln('Procedure: ', z:1:1);
z := Power2(x, y);
writeln('Function: ', z:1:1);
END. 