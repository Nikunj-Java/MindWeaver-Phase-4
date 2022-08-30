import { Pipe, PipeTransform } from "@angular/core";

@Pipe({name:'changeString'})
export class CustomPipes implements PipeTransform{

    transform(value: string,character:string) {
        return value.split(character).join("-");
        
    }
}