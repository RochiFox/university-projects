unit RectanglePolimor;

interface

type
  TPerson = class
    fName: string;
    constructor Create(name: string);
    function info: string; virtual;
  end;

  TStud = class(TPerson)
    fGr: string;
    constructor Create(name: string; gr: string);
    function info: string; override;
  end;

  TProf = class(TPerson)
    fDep: string;
    constructor Create(name: string; dep: string);
    function info: string; override;
  end;

implementation

constructor TPerson.Create(name: string);
begin
  fName := name;
end;

constructor TStud.Create(name: string; gr: string);
begin
  inherited Create(name);
  fGr := gr;
end;

constructor TProf.Create(name: string; dep: string);
begin
  inherited Create(name);
  fDep := dep;
end;

function TPerson.info: string;
begin
  Result := fName;
end;

function TStud.info: string;
begin
  Result := fName + ' gr.' + fGr;
end;

function TProf.info: string;
begin
  Result := fName + ' kaf.' + fDep;
end;

end.
