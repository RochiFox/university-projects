program Project1;

uses
  System.SysUtils,
  Incaps in 'Incaps.pas';

var
  student: TPerson;

begin
  student := TPerson.Create('Ivanov');

  student.Address := 'Poltava, Frunze, 20';

  writeln('name = ', student.name, '; adressa = ', student.Address);

  student.Free;

  readln;
end.
