import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router'
import { NgZorroImportsModule } from './NgZorroImports.module';

@NgModule({
  imports: [ReactiveFormsModule, CommonModule, NgZorroImportsModule, RouterModule],
  exports: [ReactiveFormsModule, CommonModule, NgZorroImportsModule, RouterModule],
})
export class SharedModule {}