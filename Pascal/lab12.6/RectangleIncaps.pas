unit RectangleIncaps;

interface

type
  TRectangle = class
  private
    FLength, FWidth: Integer;

  public
    constructor Create(aLength, aWidth: Integer);

    function GetLength: Integer;
    function GetWidth: Integer;

    procedure SetLength(aLength: Integer);
    procedure SetWidth(aWidth: Integer);

    procedure DisplayInfo;

    property Length: Integer read GetLength write SetLength;
    property Width: Integer read GetWidth write SetWidth;
  end;

implementation

constructor TRectangle.Create(aLength, aWidth: Integer);
begin
  FLength := aLength;
  FWidth := aWidth;
end;

function TRectangle.GetLength: Integer;
begin
  Result := FLength;
end;

function TRectangle.GetWidth: Integer;
begin
  Result := FWidth;
end;

procedure TRectangle.SetLength(aLength: Integer);
begin
  FLength := aLength;
end;

procedure TRectangle.SetWidth(aWidth: Integer);
begin
  FWidth := aWidth;
end;

procedure TRectangle.DisplayInfo;
begin
  Writeln('Length: ', Length);
  Writeln('Width: ', Width);
end;

end.

