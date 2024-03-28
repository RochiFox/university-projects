program PolymorphismProgram;

uses
  SysUtils,
  RectanglePolimor in 'RectanglePolimor.pas';

const
  SIZE = 5;

var
  list: array[1..SIZE] of TPerson;
  i: integer;
  key: char;
  name, group, department: string;

begin
  for i := 1 to SIZE do
  begin
    Writeln('Enter "s" for student or "t" for teacher:');
    Readln(key);

    if (key = 'T') or (key = 't') then
    begin
      Write('Enter name of teacher: '); Readln(name);
      Write('Enter department: '); Readln(department);
      list[i] := TProf.Create(name, department);
    end
    else if (key = 'S') or (key = 's') then
    begin
      Write('Enter name of student: '); Readln(name);
      Write('Enter group: '); Readln(group);
      list[i] := TStud.Create(name, group);
    end;
  end;

  for i := 1 to SIZE do
    Writeln(list[i].info);

  Readln;
end.
