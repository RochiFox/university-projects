unit Incaps;

interface

type
  TPerson = class

  private
    FName: string;
    FAddress: string;

    function GetName: string;
    function GetAddress: string;
    procedure SetAddress(NewAddress: string);

  public
    constructor Create(name: string);
    property Name: string read GetName;
    property Address: string read GetAddress write SetAddress;
  end;

implementation

constructor TPerson.Create(name: string);
begin
  FName := name;
end;

function TPerson.GetName: string;
begin
  Result := FName;
end;

function TPerson.GetAddress: string;
begin
  Result := FAddress;
end;

procedure TPerson.SetAddress(NewAddress: string);
begin
  FAddress := NewAddress;
end;

end.

