program Project1;

uses
  System.SysUtils,
  Polimor in 'Polimor.pas';

const
  SIZE = 5;

var
  list: array[1..SIZE] of TPerson;

  i: integer;
  key: char;
  name, grupa, kafedra: string;

begin
  for i:= 1 to SIZE do
  begin
    writeln('Enter student or teacher.');
    writeln('If student = enter keys " s"; if teacher - enter key "t":');

    readln(key);

    if (key = 'T') or (key = 't') then
    begin
      write('Enter name of teacher:'); readln(name);
      write('Enter kafedra:'); readln(kafedra);

      List[i] := TProf.Create(name, kafedra);
    end;

    writeln;
  end;

  for i := 1 to SIZE do
  begin
    writeln(List[i].info);
  end;

  readln;
end.
