import { TestBed } from '@angular/core/testing';

import { ClaseVueloService } from './clase-vuelo.service';

describe('ClaseVueloService', () => {
  let service: ClaseVueloService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ClaseVueloService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
