unit UnitVector;

interface

type
  Mas = array [1..10] of Integer;

  Vector = class
    private
      n: Integer; // Розмірність вектору
      vec: Mas; // Значення елементів вектора
      name: Char; // Ім'я вектора

    public
      procedure Init(ch: Char);
      procedure ShowVec(ch: Char);
      procedure Scalar(v: Vector);
  end;

implementation

// Ініціалізація вектора
procedure Vector.Init(ch: Char);
var
  i: Integer;
begin
  name := ch;
  writeln('Input the number of vector ', name, ' components');
  readln(n);
  writeln('Input ', n, ' components:');
  for i := 1 to n do
    read(vec[i]);
end;

// Вивід вектора
procedure Vector.ShowVec(ch: Char);
var
  i: Integer;
begin
  name := ch;
  writeln('Vector ', name, ':');
  for i := 1 to n do
    write(vec[i], ' ');
  writeln;
end;

// Обчислення скалярного добутку вектора
procedure Vector.Scalar(v: Vector);
var
  sum, i: Integer;
begin
  if n <> v.n then
  begin
    writeln('Vector lengths are different');
    readln;
    exit;
  end
  else
  begin
    sum := 0;
    for i := 1 to n do
      sum := sum + vec[i] * v.vec[i];
    writeln('Scalar product = ', sum);
  end;
end;

end.

