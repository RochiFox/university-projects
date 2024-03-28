program RectangleProgram;

uses
  SysUtils,
  RectangleIncaps in 'RectangleIncaps.pas';

var
  rect1, rect2: TRectangle;

begin
  rect1 := TRectangle.Create(5, 10);
  rect2 := TRectangle.Create(8, 15);

  rect1.DisplayInfo;
  rect2.DisplayInfo;

  rect1.Free;
  rect2.Free;

  ReadLn;
end.

