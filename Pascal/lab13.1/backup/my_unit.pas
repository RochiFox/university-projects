unit My_unit;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, Forms, Controls, Graphics, Dialogs, StdCtrls, ExtCtrls;

type

  { TFormLab1 }

  TFormLab1 = class(TForm)
    Button1: TButton;
    FormLabel: TLabel;
    procedure Button1Click(Sender: TObject);
  private

  public

  end;

var
  FormLab1: TFormLab1;

implementation

{$R *.lfm}

{ TFormLab1 }

procedure TFormLab1.Button1Click(Sender: TObject);
begin
   FormLabel.Caption := 'Мій перший проект у середовищі Delphi';
end;

end.

