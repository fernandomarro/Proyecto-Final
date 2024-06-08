import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarPasajeroComponent } from './buscar-pasajero.component';

describe('BuscarPasajeroComponent', () => {
  let component: BuscarPasajeroComponent;
  let fixture: ComponentFixture<BuscarPasajeroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BuscarPasajeroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BuscarPasajeroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
