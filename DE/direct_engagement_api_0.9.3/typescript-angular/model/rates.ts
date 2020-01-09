/**
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface Rates { 
    reference?: Rates.ReferenceEnum;
    rate?: number;
}
export namespace Rates {
    export type ReferenceEnum = 'basic_worker_pay' | 'basic_commission' | 'basic_ni' | 'enhanced_worker_pay' | 'enhanced_commission' | 'enhanced_ni' | 'fixed_worker_pay' | 'fixed_commission' | 'fixed_ni' | 'enhanced_night_worker_pay' | 'enhanced_night_commission' | 'enhanced_night_ni' | 'enhanced_saturday_worker_pay' | 'enhanced_saturday_commission' | 'enhanced_saturday_ni' | 'enhanced_sunday_worker_pay' | 'enhanced_sunday_commission' | 'enhanced_sunday_ni' | 'enhanced_holiday_worker_pay' | 'enhanced_holiday_commission' | 'enhanced_holiday_ni';
    export const ReferenceEnum = {
        BasicWorkerPay: 'basic_worker_pay' as ReferenceEnum,
        BasicCommission: 'basic_commission' as ReferenceEnum,
        BasicNi: 'basic_ni' as ReferenceEnum,
        EnhancedWorkerPay: 'enhanced_worker_pay' as ReferenceEnum,
        EnhancedCommission: 'enhanced_commission' as ReferenceEnum,
        EnhancedNi: 'enhanced_ni' as ReferenceEnum,
        FixedWorkerPay: 'fixed_worker_pay' as ReferenceEnum,
        FixedCommission: 'fixed_commission' as ReferenceEnum,
        FixedNi: 'fixed_ni' as ReferenceEnum,
        EnhancedNightWorkerPay: 'enhanced_night_worker_pay' as ReferenceEnum,
        EnhancedNightCommission: 'enhanced_night_commission' as ReferenceEnum,
        EnhancedNightNi: 'enhanced_night_ni' as ReferenceEnum,
        EnhancedSaturdayWorkerPay: 'enhanced_saturday_worker_pay' as ReferenceEnum,
        EnhancedSaturdayCommission: 'enhanced_saturday_commission' as ReferenceEnum,
        EnhancedSaturdayNi: 'enhanced_saturday_ni' as ReferenceEnum,
        EnhancedSundayWorkerPay: 'enhanced_sunday_worker_pay' as ReferenceEnum,
        EnhancedSundayCommission: 'enhanced_sunday_commission' as ReferenceEnum,
        EnhancedSundayNi: 'enhanced_sunday_ni' as ReferenceEnum,
        EnhancedHolidayWorkerPay: 'enhanced_holiday_worker_pay' as ReferenceEnum,
        EnhancedHolidayCommission: 'enhanced_holiday_commission' as ReferenceEnum,
        EnhancedHolidayNi: 'enhanced_holiday_ni' as ReferenceEnum
    };
}


