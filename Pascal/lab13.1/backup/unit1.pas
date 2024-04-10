unit Unit1;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, Forms, Controls, Graphics, Dialogs, StdCtrls, ExtCtrls;

type

  { TFormLab1 }

  TFormLab1 = class(TForm)
    Button1: TButton;
    Label1: TLabel;
    procedure Button1Click(Sender: TObject);
    procedure Label1Click(Sender: TObject);
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
   Label1.Caption := 'Мій перший проект у середовищі Delphi';
end;

end.

