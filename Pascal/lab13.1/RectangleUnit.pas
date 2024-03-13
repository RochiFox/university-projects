unit RectangleUnit;

interface

type
  TRectangle = class
  private
    length, width: Integer;

  public
    constructor Create(aLength, aWidth: Integer);

    procedure DisplayInfo;
  end;

implementation

constructor TRectangle.Create(aLength, aWidth: Integer);
begin
  length := aLength;
  width := aWidth;
end;

procedure TRectangle.DisplayInfo;
begin
  Writeln('Length: ', length);
  Writeln('Width: ', width);
end;

end.
