import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeleccionarVueloComponent } from './seleccionar-vuelo.component';

describe('SeleccionarVueloComponent', () => {
  let component: SeleccionarVueloComponent;
  let fixture: ComponentFixture<SeleccionarVueloComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeleccionarVueloComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SeleccionarVueloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
