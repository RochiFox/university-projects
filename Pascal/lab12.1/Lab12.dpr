program lab12;

uses
  System.SysUtils,
  UnitVector in 'UnitVector.pas';

Var
  v1, v2: Vector;

begin
    writeln('Create vectors');

    v1 := Vector.Create;
    v2 := Vector.Create;

    v1.Init('A');
    v2.Init('D');

    v1.ShowVec('A'); // Виведення вектора А
    v2.ShowVec('B'); // Виведення вектора В

    v1.Scalar(v2); // Обчислення скалярного добутку векторів

    v1.Free; // Звільнення пам'яті використання деструктору
    v2.Free; // Звільнення пам'яті використання деструктору

    readln;
    readln;
end.

