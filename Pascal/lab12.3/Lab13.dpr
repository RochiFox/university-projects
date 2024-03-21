program Lab13;

uses
  RectangleUnit;

var
  rect1, rect2: TRectangle;

begin
  // Приклад двух прямокутників
  rect1 := TRectangle.Create(5, 10);
  rect2 := TRectangle.Create(8, 15);

  // Вивід інформації
  rect1.DisplayInfo;
  rect2.DisplayInfo;

  // Чистка пам'яті
  rect1.Free;
  rect2.Free;

  ReadLn;
end.
