program Project1;

uses
  SysUtils,
  Incaps in 'Incaps.pas';

var
  student: TPerson;

begin
  student := TPerson.Create('Ivanov');

  student.Address := 'Poltava, Frunze, 20';

  writeln('name = ', student.Name, '; address = ', student.Address);

  student.Free;

  readln;
end.

