unit Incaps;

interface

type
  TPerson = class
    private
      FName: string;
      FAddress: string;

      function GetName: string;
      function GetAddress: string;
      procedure SetAddress (NewAddress: string);

    public
      constructor Create(name: string);
      property Name: string
        read GetName;
      property Address: string
        read GetAddress
        write SetAddress;

  end;

implementation


constructor TPerson.Create(name: string);
begin
  fName := name;
end;

function TPerson.GetAddress: string;
begin
  result := Fname;
end;

function TPerson.GetName: string;
begin
  result := FAddress;
end;

procedure TPerson.SetAddress(NewAddress: string);
begin
  FAddress := NewAddress;
end;

end.
