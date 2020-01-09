/**
 * Reference data and Mappings API
 *      ## API for accessing reference data and mapping information 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { VocabularyType } from './vocabularyType';


export interface MappingSet { 
    /**
     * ID of this mapping set
     */
    id: string;
    vocabularyType: VocabularyType;
}
