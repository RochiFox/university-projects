unit Unit1;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, Forms, Controls, Graphics, Dialogs, StdCtrls;

type

  { TForm1 }

  TForm1 = class(TForm)
    Button1: TButton;
    Button3: TButton;
    Edit1: TEdit;
    Edit2: TEdit;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    procedure Button1Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
  private
    Barrels: Double;
    Liters: Double;
  public

  end;

var
  Form1: TForm1;

implementation

{$R *.lfm}

{ TForm1 }

procedure TForm1.Button1Click(Sender: TObject);
begin
    if Edit1.Text = '' then
  begin
    Liters := StrToFloat(Edit2.Text);
    Barrels := Liters / 158.987;
    Edit1.Text := FloatToStr(Barrels);
  end
  else if Edit2.Text = '' then
  begin
    Barrels := StrToFloat(Edit1.Text);
    Liters := Barrels * 158.987;
    Edit2.Text := FloatToStr(Liters);
  end;
end;

procedure TForm1.Button3Click(Sender: TObject);
begin
    Application.Terminate;
end;

end.

